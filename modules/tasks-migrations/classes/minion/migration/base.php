<?php defined('SYSPATH') or die('No direct script access.');

/**
 * The base migration class, must be extended by all migration files
 *
 * Each migration file must implement an up() and a down() which are used to 
 * apply / remove this migration from the schema respectively
 *
 * @author Matt Button <matthew@sigswitch.com>
 */
abstract class Minion_Migration_Base {

	/**
	 * Array of information about this migration
	 * @var array
	 */
	protected $_info = array();

	/**
	 * Constructs the migration
	 *
	 * @param array Information about this migration
	 */
	public function __construct(array $info)
	{
		$this->_info = $info;
	}

	/**
	 * Get the name of the database connection group this migration should be run against
	 *
	 * @return string
	 */
	public function get_database_connection()
	{
		$config   = Kohana::$config->load('minion/migration');
		$group = $this->_info['group'];

		if (isset($config->group_connection[$group]))
		{
			return $config->group_connection[$group];
		}

		return Database::$default;
	}

	/**
	 * Runs any SQL queries necessary to bring the database up a migration version
	 *
	 * @param Kohana_Database The database connection to perform actions on
	 */
	abstract public function up(Kohana_Database $db);

	/**
	 * Runs any SQL queries necessary to bring the database schema down a version
	 *
	 * @param Kohana_Database The database connection to perform actions on
	 */
	abstract public function down(Kohana_Database $db);
}
